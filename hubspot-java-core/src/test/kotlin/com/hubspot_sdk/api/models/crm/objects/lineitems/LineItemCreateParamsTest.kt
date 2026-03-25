// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.lineitems

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.objects.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemCreateParamsTest {

    @Test
    fun create() {
        LineItemCreateParams.builder()
            .simplePublicObjectInputForCreate(
                SimplePublicObjectInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LineItemCreateParams.builder()
                .simplePublicObjectInputForCreate(
                    SimplePublicObjectInputForCreate.builder()
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .properties(
                            SimplePublicObjectInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
