// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormListParamsTest {

    @Test
    fun create() {
        FormListParams.builder()
            .after("after")
            .archived(true)
            .addFormType(FormListParams.FormType.HUBSPOT)
            .limit(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FormListParams.builder()
                .after("after")
                .archived(true)
                .addFormType(FormListParams.FormType.HUBSPOT)
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("formTypes", listOf("hubspot").joinToString(","))
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FormListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
