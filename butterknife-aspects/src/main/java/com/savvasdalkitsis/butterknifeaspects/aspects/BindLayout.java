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
import android.app.DialogFragment;
import android.app.Fragment;
import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.shazam.android.aspects.annotations.Aspects;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import butterknife.ButterKnife;

/**
 * Apply this annotation to an {@link Activity}, {@link AppCompatActivity}, {@link FragmentActivity},
 * {@link Fragment}, {@link android.support.v4.app.Fragment}, {@link DialogFragment} or
 * {@link android.support.v4.app.DialogFragment} and it will automatically bind the provided layout
 * to its view using {@link ButterKnife}
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Aspects(aspects = {
        ButterKnifeActivityAspect.class,
        ButterKnifeAppCompatActivityAspect.class,
        ButterKnifeSupportActivityAspect.class,
        ButterKnifeFragmentAspect.class,
        ButterKnifeDialogFragmentAspect.class,
        ButterKnifeSupportFragmentAspect.class,
        ButterKnifeSupportDialogFragmentAspect.class
})
public @interface BindLayout {

    /**
     * This layout id will be used to bind the annotated object using {@link ButterKnife}
     */
    @LayoutRes int value();
}
