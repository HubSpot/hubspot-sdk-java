// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.batch

import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociation
import com.hubspot_sdk.api.models.crm.associations.PublicAssociation
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociation(
                BatchInputPublicAssociation.builder()
                    .addInput(
                        PublicAssociation.builder()
                            .from(PublicObjectId.builder().id("53628").build())
                            .to(PublicObjectId.builder().id("12726").build())
                            .type("contact_to_company")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociation(
                    BatchInputPublicAssociation.builder()
                        .addInput(
                            PublicAssociation.builder()
                                .from(PublicObjectId.builder().id("53628").build())
                                .to(PublicObjectId.builder().id("12726").build())
                                .type("contact_to_company")
                                .build()
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
            BatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociation(
                    BatchInputPublicAssociation.builder()
                        .addInput(
                            PublicAssociation.builder()
                                .from(PublicObjectId.builder().id("53628").build())
                                .to(PublicObjectId.builder().id("12726").build())
                                .type("contact_to_company")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociation.builder()
                    .addInput(
                        PublicAssociation.builder()
                            .from(PublicObjectId.builder().id("53628").build())
                            .to(PublicObjectId.builder().id("12726").build())
                            .type("contact_to_company")
                            .build()
                    )
                    .build()
            )
    }
}
