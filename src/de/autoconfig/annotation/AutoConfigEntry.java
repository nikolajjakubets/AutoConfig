package de.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.autoconfig.parser.IAutoConfigParser;
import de.autoconfig.parser.NullParser;
import de.autoconfig.source.IAutoConfigSourceLoader;
import de.autoconfig.validator.IAutoConfigValidator;
import de.autoconfig.validator.NullValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoConfigEntry
{
	Class<? extends IAutoConfigSourceLoader> loader();
	String source();
	String ident() default "";
	boolean hasDefValue() default false;
	String defValue() default "";
	Class<? extends IAutoConfigParser<?>> parser() default NullParser.class;
	Class<? extends IAutoConfigValidator<?>> validator() default NullValidator.class;
}
