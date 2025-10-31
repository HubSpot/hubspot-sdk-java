// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SitePageRestoreRevisionToDraftParamsTest {

    @Test
    fun create() {
        SitePageRestoreRevisionToDraftParams.builder().objectId("objectId").revisionId(0L).build()
    }

    @Test
    fun pathParams() {
        val params =
            SitePageRestoreRevisionToDraftParams.builder()
                .objectId("objectId")
                .revisionId(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
