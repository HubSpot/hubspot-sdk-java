// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.lists.MembershipChangeRequest
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAllFromListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAndRemoveParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetListsParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MembershipServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val pageFuture = membershipServiceAsync.list("listId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val membershipsUpdateResponseFuture =
            membershipServiceAsync.add(
                MembershipAddParams.builder().listId("listId").addBody("string").build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addAllFromList() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val future =
            membershipServiceAsync.addAllFromList(
                MembershipAddAllFromListParams.builder()
                    .listId("listId")
                    .sourceListId("sourceListId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addAndRemove() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val membershipsUpdateResponseFuture =
            membershipServiceAsync.addAndRemove(
                MembershipAddAndRemoveParams.builder()
                    .listId("listId")
                    .membershipChangeRequest(
                        MembershipChangeRequest.builder()
                            .recordIdsToAdd(listOf("123", "456", "789"))
                            .addRecordIdsToRemove("654")
                            .build()
                    )
                    .build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLists() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val apiCollectionResponseRecordListMembershipNoPagingFuture =
            membershipServiceAsync.getLists(
                MembershipGetListsParams.builder()
                    .objectTypeId("objectTypeId")
                    .recordId("recordId")
                    .build()
            )

        val apiCollectionResponseRecordListMembershipNoPaging =
            apiCollectionResponseRecordListMembershipNoPagingFuture.get()
        apiCollectionResponseRecordListMembershipNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPageOrderedByAddedToListDate() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val pageFuture = membershipServiceAsync.getPageOrderedByAddedToListDate("listId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val membershipsUpdateResponseFuture =
            membershipServiceAsync.remove(
                MembershipRemoveParams.builder().listId("listId").addBody("string").build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAll() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipServiceAsync = client.crm().lists().memberships()

        val future = membershipServiceAsync.removeAll("listId")

        val response = future.get()
    }
}
