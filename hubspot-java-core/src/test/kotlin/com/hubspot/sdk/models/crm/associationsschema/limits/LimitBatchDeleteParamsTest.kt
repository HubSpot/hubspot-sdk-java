// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associationsschema.limits

import com.hubspot.sdk.models.crm.associationsschema.BatchInputPublicAssociationSpec
import com.hubspot.sdk.models.crm.associationsschema.PublicAssociationSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitBatchDeleteParamsTest {

    @Test
    fun create() {
        LimitBatchDeleteParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationSpec(
                BatchInputPublicAssociationSpec.builder()
                    .addInput(
                        PublicAssociationSpec.builder().category("category").typeId(0).build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LimitBatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LimitBatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociationSpec.builder()
                    .addInput(
                        PublicAssociationSpec.builder().category("category").typeId(0).build()
                    )
                    .build()
            )
    }
}
