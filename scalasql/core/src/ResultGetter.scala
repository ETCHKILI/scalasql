package scalasql.core

import java.sql.ResultSet

trait ResultGetter[T] {
  /**
   * How to extract a value of type [[T]] from a `ResultSet`
   */
  def get(r: ResultSet, idx: Int): T
}
