// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingGetObjectDefinitionsByMediaTypeParamsTest {

    @Test
    fun create() {
        IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
            .appId("appId")
            .mediaType("mediaType")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                .appId("appId")
                .mediaType("mediaType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("mediaType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
