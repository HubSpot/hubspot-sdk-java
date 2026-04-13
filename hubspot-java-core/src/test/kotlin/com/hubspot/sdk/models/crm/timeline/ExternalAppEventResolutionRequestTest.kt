// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAppEventResolutionRequestTest {

    @Test
    fun create() {
        val externalAppEventResolutionRequest =
            ExternalAppEventResolutionRequest.builder()
                .developerSymbol("developerSymbol")
                .projectName("projectName")
                .build()

        assertThat(externalAppEventResolutionRequest.developerSymbol()).isEqualTo("developerSymbol")
        assertThat(externalAppEventResolutionRequest.projectName()).isEqualTo("projectName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAppEventResolutionRequest =
            ExternalAppEventResolutionRequest.builder()
                .developerSymbol("developerSymbol")
                .projectName("projectName")
                .build()

        val roundtrippedExternalAppEventResolutionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAppEventResolutionRequest),
                jacksonTypeRef<ExternalAppEventResolutionRequest>(),
            )

        assertThat(roundtrippedExternalAppEventResolutionRequest)
            .isEqualTo(externalAppEventResolutionRequest)
    }
}
