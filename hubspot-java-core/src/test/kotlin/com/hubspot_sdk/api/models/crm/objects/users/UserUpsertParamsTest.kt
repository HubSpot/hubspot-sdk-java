// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.users

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInputUpsert
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpsertParamsTest {

    @Test
    fun create() {
        UserUpsertParams.builder()
            .batchInputSimplePublicObjectBatchInputUpsert(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("idProperty")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UserUpsertParams.builder()
                .batchInputSimplePublicObjectBatchInputUpsert(
                    BatchInputSimplePublicObjectBatchInputUpsert.builder()
                        .addInput(
                            SimplePublicObjectBatchInputUpsert.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInputUpsert.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .idProperty("idProperty")
                                .objectWriteTraceId("objectWriteTraceId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("idProperty")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpsertParams.builder()
                .batchInputSimplePublicObjectBatchInputUpsert(
                    BatchInputSimplePublicObjectBatchInputUpsert.builder()
                        .addInput(
                            SimplePublicObjectBatchInputUpsert.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInputUpsert.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
