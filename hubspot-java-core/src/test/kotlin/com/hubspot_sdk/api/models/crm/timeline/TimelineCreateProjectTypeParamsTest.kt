// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineCreateProjectTypeParamsTest {

    @Test
    fun create() {
        TimelineCreateProjectTypeParams.builder()
            .externalAppEventResolutionRequest(
                ExternalAppEventResolutionRequest.builder()
                    .developerSymbol("developerSymbol")
                    .projectName("projectName")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TimelineCreateProjectTypeParams.builder()
                .externalAppEventResolutionRequest(
                    ExternalAppEventResolutionRequest.builder()
                        .developerSymbol("developerSymbol")
                        .projectName("projectName")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalAppEventResolutionRequest.builder()
                    .developerSymbol("developerSymbol")
                    .projectName("projectName")
                    .build()
            )
    }
}
