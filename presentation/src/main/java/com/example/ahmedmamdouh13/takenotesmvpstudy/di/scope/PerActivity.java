package com.example.ahmedmamdouh13.takenotesmvpstudy.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {}