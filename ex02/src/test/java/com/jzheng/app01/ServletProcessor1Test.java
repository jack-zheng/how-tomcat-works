package com.jzheng.app01;

import com.jzheng.common.Constants;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class ServletProcessor1Test {
    @Test
    public void test_URL() throws IOException {
        File classPath = new File(Constants.WEB_ROOT);
        System.out.println(classPath.getCanonicalPath());
        System.out.println(classPath.getPath());
    }
}