package com.data.entry.provider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import com.data.entry.ds.Student;

public class AgeLableProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		Student student = (Student) element;
		return String.valueOf(student.getAge());
	}
	
}
