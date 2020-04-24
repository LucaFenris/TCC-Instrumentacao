package io.fenris.instrumentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.uber.jaeger.Configuration;
import com.uber.jaeger.samplers.ConstSampler;

@SpringBootApplication
public class TccInstrumentationApplication {

	@Bean
	public io.opentracing.Tracer jaegerTracer() {
		return new Configuration("fenris-instrumentation",
				new Configuration.SamplerConfiguration(ConstSampler.TYPE, 1),
				new Configuration.ReporterConfiguration()).getTracer();
	}

	public static void main(String[] args) {
		SpringApplication.run(TccInstrumentationApplication.class, args);
	}

}
