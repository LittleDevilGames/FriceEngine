package org.frice.game.anim.scale

import org.frice.game.anim.FAnim

/**
 * Created by ice1000 on 2016/8/15.
 * @author ice1000
 * @since v0.2.2
 */
abstract class ScaleAnim : FAnim() {
	abstract fun getAfter(): Pair<Double, Double>
}

/**
 * Created by ice1000 on 2016/8/15.
 * @author ice1000
 * @since v0.2.3
 */
class SimpleScale(var x: Double, var y: Double) : ScaleAnim() {
	private val timeFromStart: Double
		get() = System.currentTimeMillis().toDouble() / 1000 - start

	override fun getAfter() = Pair(
			x * timeFromStart,
			y * timeFromStart)
}