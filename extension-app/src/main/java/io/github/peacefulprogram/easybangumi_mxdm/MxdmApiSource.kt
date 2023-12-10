package io.github.peacefulprogram.easybangumi_mxdm

import com.heyanle.extension_api.ExtensionIconSource
import com.heyanle.extension_api.ExtensionSource
import kotlin.reflect.KClass

class MxdmApiSource : ExtensionSource(), ExtensionIconSource {
    override val describe: String
        get() = label
    override val label: String
        get() = "MX动漫"
    override val version: String
        get() = "1.0"
    override val versionCode: Int
        get() = 1

    override fun getIconResourcesId(): Int = R.drawable.mxdm

    override val sourceKey: String
        get() = "io.github.peacefulprogram.easybangumi_mxdm"

    override fun register(): List<KClass<*>> {
        return listOf(
            MxdmPageComponent::class,
            MxdmSearchComponent::class,
            MxdmDetailComponent::class,
            MxdmPlayComponent::class,
        )
    }
}