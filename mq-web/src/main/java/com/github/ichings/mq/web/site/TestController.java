package com.github.ichings.mq.web.site;

import com.github.ichings.mq.common.kernel.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 宋欢
 */
@RestController
@RequestMapping(value = {"test"})
@Api(value = "TestController", tags = "测试")
@Validated
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "Test", notes = "测试", response = String.class, produces = "application/json")
    public Result<String> test() {
        logger.info("abc");

        return new Result<>();
    }

}
