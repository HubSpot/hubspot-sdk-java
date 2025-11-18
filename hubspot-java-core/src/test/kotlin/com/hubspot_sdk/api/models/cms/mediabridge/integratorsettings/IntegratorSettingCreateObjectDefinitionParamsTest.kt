// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorObjectCreationRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingCreateObjectDefinitionParamsTest {

    @Test
    fun create() {
        IntegratorSettingCreateObjectDefinitionParams.builder()
            .appId(0)
            .integratorObjectCreationRequest(
                IntegratorObjectCreationRequest.builder()
                    .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingCreateObjectDefinitionParams.builder()
                .appId(0)
                .integratorObjectCreationRequest(
                    IntegratorObjectCreationRequest.builder()
                        .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingCreateObjectDefinitionParams.builder()
                .appId(0)
                .integratorObjectCreationRequest(
                    IntegratorObjectCreationRequest.builder()
                        .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IntegratorObjectCreationRequest.builder()
                    .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                    .build()
            )
    }
}
