/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.savvasdalkitsis.butterknifeaspects.aspects;

import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

class Binder {

    static void bindTo(Activity activity) {
        activity.setContentView(findLayoutId(activity));
        ButterKnife.bind(activity);
    }

    static View bindTo(Fragment fragment, LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(findLayoutId(fragment), container, false);
        ButterKnife.bind(fragment, view);
        return view;
    }

    static View bindTo(android.support.v4.app.Fragment fragment, LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(findLayoutId(fragment), container, false);
        ButterKnife.bind(fragment, view);
        return view;
    }

    private static int findLayoutId(Object annotatedObject) {
        BindLayout annotation = annotatedObject.getClass().getAnnotation(BindLayout.class);
        return annotation.value();
    }
}
