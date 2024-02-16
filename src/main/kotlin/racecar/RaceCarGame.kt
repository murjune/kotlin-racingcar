import racecar.KernelRaceCarGameInputView
import racecar.KernelRaceCarGameOutputView
import racecar.RaceCarGameOutputView
import kotlin.random.Random

class RaceCarGame(
    private val inputView: RaceCarGameInputView = KernelRaceCarGameInputView(),
    private val outputView: RaceCarGameOutputView = KernelRaceCarGameOutputView(),
    private val numberGenerator: NumberGenerator = NumberGenerator { Random.nextInt(10) },
) {
    fun start() {
        val cars: RaceCars = initRaceCars()
        val trialCount: Int = initTrialCount()
        startRaceGame(cars, trialCount)
    }

    private fun initRaceCars(): RaceCars {
        outputView.outputCarNamesRequest()
        return RaceCars.from(
            carNames = inputView.inputCarNames(),
            numberGenerator = numberGenerator,
        )
    }

    private fun initTrialCount(): Int {
        outputView.outputTrialCountRequest()
        return inputView.inputTrialCount()
    }

    private fun startRaceGame(
        cars: RaceCars,
        trialCount: Int,
    ) {
        val winners =
            cars.run {
                startRace(trialCount)
                findHeadGroup()
            }
        outputView.outputWinners(winners)
    }

    private fun RaceCars.startRace(trialCount: Int) {
        outputView.outputRaceResultTitle()
        repeat(trialCount) {
            move()
            outputView.outputRacingStatus(cars)
        }
    }
}
