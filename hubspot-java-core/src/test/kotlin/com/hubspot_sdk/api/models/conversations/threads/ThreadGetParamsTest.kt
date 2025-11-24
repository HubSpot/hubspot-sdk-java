// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadGetParamsTest {

    @Test
    fun create() {
        ThreadGetParams.builder()
            .threadId(0L)
            .archived(true)
            .addAssociation(ThreadGetParams.Association.TICKET)
            .property("property")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ThreadGetParams.builder().threadId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ThreadGetParams.builder()
                .threadId(0L)
                .archived(true)
                .addAssociation(ThreadGetParams.Association.TICKET)
                .property("property")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("association", listOf("TICKET").joinToString(","))
                    .put("property", "property")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ThreadGetParams.builder().threadId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
