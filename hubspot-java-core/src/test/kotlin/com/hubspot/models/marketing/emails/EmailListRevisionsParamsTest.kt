// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailListRevisionsParamsTest {

    @Test
    fun create() {
        EmailListRevisionsParams.builder()
            .emailId("emailId")
            .after("after")
            .before("before")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = EmailListRevisionsParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EmailListRevisionsParams.builder()
                .emailId("emailId")
                .after("after")
                .before("before")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailListRevisionsParams.builder().emailId("emailId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
