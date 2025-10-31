// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingCreateObjectDefinitionParamsTest {

    @Test
    fun create() {
        IntegratorSettingCreateObjectDefinitionParams.builder()
            .appId("appId")
            .addMediaType(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingCreateObjectDefinitionParams.builder()
                .appId("appId")
                .addMediaType(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingCreateObjectDefinitionParams.builder()
                .appId("appId")
                .addMediaType(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
                .build()

        val body = params._body()

        assertThat(body.mediaTypes())
            .containsExactly(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
    }
}
