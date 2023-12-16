import android.app.Application
import com.example.cleanjpc.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class PostsApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PostsApplication)
            modules(
                apiModule,
                viewModelModule,
                repositoryModule,
                networkModule,
                useCaseModule
            )
        }

    }
}
