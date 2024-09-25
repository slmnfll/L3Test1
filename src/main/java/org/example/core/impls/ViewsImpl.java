package org.example.core.impls;

import org.example.core.IViews;

import java.util.Scanner;

public abstract class ViewsImpl<T> implements IViews<T> {
    protected Scanner scanner = new Scanner(System.in);
}
