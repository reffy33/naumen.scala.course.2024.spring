import utest._

object Test extends TestSuite{



    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2,5))
            assert(Exercises.primeFactor(105) == Seq(3,5,7))
            assert(Exercises.primeFactor(564) == Seq(2,3,47))
        }

        'sumScalars - {
            val vector1 = Exercises.Vector2D(1.0, 2.0)
            val vector2 = Exercises.Vector2D(3.0, 4.0)
            val vector3 = Exercises.Vector2D(5.0, 6.0)
            val vector4 = Exercises.Vector2D(7.0, 8.0)
            assert(Exercises.sumScalars(vector1, vector2, vector3, vector4) == 94.0)
        }

        'sumCosines - {
            val vector1 = Exercises.Vector2D(1.0, 2.0)
            val vector2 = Exercises.Vector2D(3.0, 4.0)
            val vector3 = Exercises.Vector2D(5.0, 6.0)
            val vector4 = Exercises.Vector2D(7.0, 8.0)
            assert(Exercises.sumCosines(vector1, vector2, vector3, vector4) == 1.9835797185673898)
        }

        'sortByHeavyweight - {
            val balls = Exercises.sortByHeavyweight()
            assert(balls.nonEmpty)
            assert(balls.length==Exercises.balls.size)
            assert(balls.head.equals("Tin"))
            assert(balls.last.equals("Graphite"))
        }
    }
}
