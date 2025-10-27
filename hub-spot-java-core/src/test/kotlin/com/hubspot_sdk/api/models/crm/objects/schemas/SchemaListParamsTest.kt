// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaListParamsTest {

    @Test
    fun create() {
        SchemaListParams.builder().archived(true).build()
    }

    @Test
    fun queryParams() {
        val params = SchemaListParams.builder().archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SchemaListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
