package br.unisinos.getfut;

import org.assertj.core.api.WithAssertions;
import org.springframework.boot.test.context.SpringBootTest;

import br.unisinos.getfut.app.GetFutApplication;

@SpringBootTest(classes = GetFutApplication.class)
public abstract class BaseGetFutApplicationTest implements WithAssertions {

}
