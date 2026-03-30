// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppEventResolutionResponseTest {

    @Test
    fun create() {
        val appEventResolutionResponse =
            AppEventResolutionResponse.builder()
                .developerQualifiedSymbol(
                    DeveloperQualifiedSymbol.builder()
                        .developerSymbol("developerSymbol")
                        .projectName("projectName")
                        .build()
                )
                .fullyQualifiedName("fullyQualifiedName")
                .build()

        assertThat(appEventResolutionResponse.developerQualifiedSymbol())
            .isEqualTo(
                DeveloperQualifiedSymbol.builder()
                    .developerSymbol("developerSymbol")
                    .projectName("projectName")
                    .build()
            )
        assertThat(appEventResolutionResponse.fullyQualifiedName()).isEqualTo("fullyQualifiedName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appEventResolutionResponse =
            AppEventResolutionResponse.builder()
                .developerQualifiedSymbol(
                    DeveloperQualifiedSymbol.builder()
                        .developerSymbol("developerSymbol")
                        .projectName("projectName")
                        .build()
                )
                .fullyQualifiedName("fullyQualifiedName")
                .build()

        val roundtrippedAppEventResolutionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appEventResolutionResponse),
                jacksonTypeRef<AppEventResolutionResponse>(),
            )

        assertThat(roundtrippedAppEventResolutionResponse).isEqualTo(appEventResolutionResponse)
    }
}
