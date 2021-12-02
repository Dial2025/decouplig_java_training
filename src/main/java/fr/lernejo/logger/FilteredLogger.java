
package fr.lernejo.logger;

import java.util.function.Predicate;

public record FilteredLogger(Logger delegate,
                             Predicate<String> condition) implements Logger {

    @Override
    public void log(String message) {
        if (condition.test(message))
            delegate.log(message);
    }

}
