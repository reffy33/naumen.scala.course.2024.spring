import scala.annotation.tailrec
import scala.collection.mutable

trait Cell {}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(value: String) extends Cell {
  override def toString: String = value
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {

  @tailrec
  private def getRef(visited: mutable.Set[ReferenceCell]): Option[Cell] = {
    table.getCell(ix, iy) match {
      case None =>  None
      case Some(cell: ReferenceCell) => {
        if (visited.contains(cell)) return None

        visited.add(cell)
        cell.getRef(visited)
      }
      case Some(cell: Cell) => Some(cell)
    }
  }

  override def toString: String = {
    val visited = mutable.Set.empty[ReferenceCell]

    getRef(visited) match {
      case None => "cyclic"
      case Some(cell: Cell) => cell.toString
    }
  }
}