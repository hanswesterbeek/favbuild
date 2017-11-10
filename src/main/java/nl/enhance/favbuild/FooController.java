package nl.enhance.favbuild;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

  @RequestMapping(value = "/foo")
  public Map<String, String> bar() {

    return Collections.singletonMap("foo", "bar");
  }
}
