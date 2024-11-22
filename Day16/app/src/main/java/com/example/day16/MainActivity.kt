package com.example.day16

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //1 создает приложение
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate() called")
    }

    //2 запускает приложение свернутое
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart() called")
    }

    //После возвращения из состояния "paused" (например, если пользователь свернул приложение и затем снова открыл его).
    //Восстанавливать состояние UI, если оно зависит от изменений, сделанных пользователем.
    //Возобновлять действия, которые были приостановлены в onPause(), такие как анимации,
    //воспроизведение мультимедиа, подписки на датчики или обновления пользовательского интерфейса.
    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop() called")
    }

    //Освобождение ресурсов (например, закрытие потоков, отмена задач или удаление слушателей).
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy() called")
    }

}