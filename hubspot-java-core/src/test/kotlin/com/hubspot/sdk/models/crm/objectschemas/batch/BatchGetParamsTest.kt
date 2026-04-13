// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas.batch

import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaBatchReadRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetParamsTest {

    @Test
    fun create() {
        BatchGetParams.builder()
            .objectSchemaBatchReadRequest(
                ObjectSchemaBatchReadRequest.builder()
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .addInput("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchGetParams.builder()
                .objectSchemaBatchReadRequest(
                    ObjectSchemaBatchReadRequest.builder()
                        .includeAssociationDefinitions(true)
                        .includeAuditMetadata(true)
                        .includePropertyDefinitions(true)
                        .addInput("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ObjectSchemaBatchReadRequest.builder()
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .addInput("string")
                    .build()
            )
    }
}
