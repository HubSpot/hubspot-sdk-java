// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SequenceGetParamsTest {

    @Test
    fun create() {
        SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()
    }

    @Test
    fun pathParams() {
        val params = SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()

        assertThat(params._pathParam(0)).isEqualTo("sequenceId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }
}
