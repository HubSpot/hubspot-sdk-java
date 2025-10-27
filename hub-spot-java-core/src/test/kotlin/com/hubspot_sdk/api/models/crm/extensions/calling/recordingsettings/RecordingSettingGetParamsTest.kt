// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingGetParamsTest {

    @Test
    fun create() {
        RecordingSettingGetParams.builder().appId(0).build()
    }

    @Test
    fun pathParams() {
        val params = RecordingSettingGetParams.builder().appId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
