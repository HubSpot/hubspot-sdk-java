// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.communicationpreferences.statuses.batch

import com.hubspot.core.http.QueryParams
import com.hubspot.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetUnsubscribeAllStatusesParamsTest {

    @Test
    fun create() {
        BatchGetUnsubscribeAllStatusesParams.builder()
            .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
            .businessUnitId(0L)
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchGetUnsubscribeAllStatusesParams.builder()
                .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                .businessUnitId(0L)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("channel", "EMAIL").put("businessUnitId", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchGetUnsubscribeAllStatusesParams.builder()
                .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }

    @Test
    fun body() {
        val params =
            BatchGetUnsubscribeAllStatusesParams.builder()
                .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                .businessUnitId(0L)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchGetUnsubscribeAllStatusesParams.builder()
                .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
