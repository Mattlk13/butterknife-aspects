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

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shazam.android.aspects.aspects.fragment.NoOpFragmentAspect;
import com.shazam.android.aspects.base.fragment.AspectFragment;

public class ButterKnifeFragmentAspect extends NoOpFragmentAspect {

    @Nullable
    @Override
    public View onCreateView(@NonNull AspectFragment fragment, LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return Binder.bindTo(fragment, inflater, container);
    }
}
