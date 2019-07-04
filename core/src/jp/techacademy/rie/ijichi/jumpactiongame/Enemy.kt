package jp.techacademy.rie.ijichi.jumpactiongame

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture,srcX:Int,srcY:Int,srcWidth:Int,srcHeight:Int):Sprite(texture,srcX,srcY,srcWidth,srcHeight) {

    companion object {
        val ENEMY_WIDTH = 0.8f
        val ENEMY_HEIGHT = 0.8f

        val ENEMY_EXIST = 0
    }
    var mState:Int = 0

    init {
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT)
        mState = ENEMY_EXIST
    }




}