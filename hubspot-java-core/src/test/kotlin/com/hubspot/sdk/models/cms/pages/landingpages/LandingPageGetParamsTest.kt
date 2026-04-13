// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageGetParamsTest {

    @Test
    fun create() {
        LandingPageGetParams.builder()
            .objectId("objectId")
            .archived(true)
            .property("property")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LandingPageGetParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LandingPageGetParams.builder()
                .objectId("objectId")
                .archived(true)
                .property("property")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("archived", "true").put("property", "property").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LandingPageGetParams.builder().objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
