package com.jakubowski.springcourse.todo;

public class HelloWorldBean {

    private String content;

    public HelloWorldBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
