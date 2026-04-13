// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.landingpages

import com.hubspot.models.cms.ContentCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageCloneParamsTest {

    @Test
    fun create() {
        LandingPageCloneParams.builder()
            .contentCloneRequestVNext(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(
                    ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(ContentCloneRequestVNext.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ContentCloneRequestVNext.builder().id("id").build())
    }
}
