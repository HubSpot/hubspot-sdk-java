// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SitePageCloneParamsTest {

    @Test
    fun create() {
        SitePageCloneParams.builder()
            .contentCloneRequestVNext(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SitePageCloneParams.builder()
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
            SitePageCloneParams.builder()
                .contentCloneRequestVNext(ContentCloneRequestVNext.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ContentCloneRequestVNext.builder().id("id").build())
    }
}
