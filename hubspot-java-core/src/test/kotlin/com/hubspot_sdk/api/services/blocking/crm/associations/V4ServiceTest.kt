// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V4ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val v4Service = client.crm().associations().v4()

        val batchResponsePublicDefaultAssociation =
            v4Service.create(
                V4CreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .fromObjectId("fromObjectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val v4Service = client.crm().associations().v4()

        val createdResponseLabelsBetweenObjectPair =
            v4Service.update(
                V4UpdateParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .addBody(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )

        createdResponseLabelsBetweenObjectPair.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val v4Service = client.crm().associations().v4()

        val page =
            v4Service.list(
                V4ListParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val v4Service = client.crm().associations().v4()

        v4Service.delete(
            V4DeleteParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .build()
        )
    }
}
