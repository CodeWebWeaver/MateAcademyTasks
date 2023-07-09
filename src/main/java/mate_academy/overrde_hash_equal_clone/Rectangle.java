package mate_academy.overrde_hash_equal_clone;

public class Rectangle implements Cloneable{
  private Integer width;
  private Integer length;
  private String color;

  public Rectangle(Integer width, Integer length, String color) {
    this.width = width;
    this.length = length;
    this.color = color;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getLength() {
    return length;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }

  @Override
  public int hashCode() {
    int result = 17;
    if (getWidth() != null) {
      result = 31 * result + getWidth();
    }
    if (getLength() != null) {
      result = 31 * result + getLength();
    }
    if (getColor() != null) {
      result = 31 * result + getColor().hashCode();
    }
    return result;
  }
  @Override
  public boolean equals(Object rect) {
    if (rect == null) {
      return false;
    }
    if (rect == this) {
      return true;
    }
    if (rect.getClass().equals(Rectangle.class)) {
      Rectangle currentRectangle = (Rectangle) rect;
      boolean result = true;
      if (getWidth() == null && currentRectangle.getWidth() != null) {
        return false;
      }
      if (getLength() == null && currentRectangle.getLength() != null) {
        return false;
      }
      if (getColor() == null && currentRectangle.getColor() != null) {
        return false;
      }
      if (getWidth() != null) {
        result &= getWidth().equals(currentRectangle.getWidth());
      }
      if (getLength() != null) {
        result &= getLength().equals(currentRectangle.getLength());
      }
      if (getColor() != null) {
        result &= getColor().equals(currentRectangle.getColor());
      }
      return result;
    }
    return false;
  }
  @Override
  public Rectangle clone() {
    try {
      return (Rectangle) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Can`t clone", e);
    }
  }
}
