package com.javastar920905.decorate.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Deractor extends Component {
  protected Component component;

  public void setComponent(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    if (component != null) {
      component.operation();
    }
  }
}
