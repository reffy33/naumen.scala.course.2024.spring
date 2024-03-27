class Table(val width: Int, val height: Int) {
  private val cells: Array[Cell] = Array.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix > -1 && ix < width && iy > -1 && iy < height)
      Some(cells(ix + iy * height))
    else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells(ix + iy * width) = cell
}