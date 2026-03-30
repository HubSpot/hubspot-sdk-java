// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalPublicList
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationListByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ListAssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListAssociationServiceAsync

    /** Gets lists associated with a marketing event by marketing event id */
    fun list(marketingEventId: String): CompletableFuture<CollectionResponseWithTotalPublicList> =
        list(marketingEventId, ListAssociationListParams.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        params: ListAssociationListParams = ListAssociationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see list */
    fun list(
        marketingEventId: String,
        params: ListAssociationListParams = ListAssociationListParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        list(marketingEventId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ListAssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicList>

    /** @see list */
    fun list(
        params: ListAssociationListParams
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        list(marketingEventId, ListAssociationListParams.none(), requestOptions)

    /** Disassociates a list from a marketing event by marketing event id and ILS list id */
    fun delete(listId: String, params: ListAssociationDeleteParams): CompletableFuture<Void?> =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListAssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ListAssociationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListAssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Associates a list with a marketing event by marketing event id and ILS list id */
    fun associate(
        listId: String,
        params: ListAssociationAssociateParams,
    ): CompletableFuture<Void?> = associate(listId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        listId: String,
        params: ListAssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        associate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associate */
    fun associate(params: ListAssociationAssociateParams): CompletableFuture<Void?> =
        associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: ListAssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Associates a list with a marketing event by external account id, external event id, and ILS
     * list id
     */
    fun associateByExternalAccount(
        listId: String,
        params: ListAssociationAssociateByExternalAccountParams,
    ): CompletableFuture<Void?> = associateByExternalAccount(listId, params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        listId: String,
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: ListAssociationAssociateByExternalAccountParams
    ): CompletableFuture<Void?> = associateByExternalAccount(params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Disassociates a list from a marketing event by external account id, external event id, and
     * ILS list id
     */
    fun deleteByExternalAccount(
        listId: String,
        params: ListAssociationDeleteByExternalAccountParams,
    ): CompletableFuture<Void?> = deleteByExternalAccount(listId, params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        listId: String,
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: ListAssociationDeleteByExternalAccountParams
    ): CompletableFuture<Void?> = deleteByExternalAccount(params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Gets lists associated with a marketing event by external account id and external event id */
    fun listByExternalAccount(
        externalEventId: String,
        params: ListAssociationListByExternalAccountParams,
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        listByExternalAccount(externalEventId, params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        externalEventId: String,
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        listByExternalAccount(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        listByExternalAccount(params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicList>

    /**
     * A view of [ListAssociationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListAssociationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists`, but is
         * otherwise the same as [ListAssociationServiceAsync.list].
         */
        fun list(
            marketingEventId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            list(marketingEventId, ListAssociationListParams.none())

        /** @see list */
        fun list(
            marketingEventId: String,
            params: ListAssociationListParams = ListAssociationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see list */
        fun list(
            marketingEventId: String,
            params: ListAssociationListParams = ListAssociationListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            list(marketingEventId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ListAssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>>

        /** @see list */
        fun list(
            params: ListAssociationListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            marketingEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            list(marketingEventId, ListAssociationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}`, but
         * is otherwise the same as [ListAssociationServiceAsync.delete].
         */
        fun delete(
            listId: String,
            params: ListAssociationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(listId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            listId: String,
            params: ListAssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ListAssociationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ListAssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}`, but
         * is otherwise the same as [ListAssociationServiceAsync.associate].
         */
        fun associate(
            listId: String,
            params: ListAssociationAssociateParams,
        ): CompletableFuture<HttpResponse> = associate(listId, params, RequestOptions.none())

        /** @see associate */
        fun associate(
            listId: String,
            params: ListAssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            associate(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associate */
        fun associate(params: ListAssociationAssociateParams): CompletableFuture<HttpResponse> =
            associate(params, RequestOptions.none())

        /** @see associate */
        fun associate(
            params: ListAssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [ListAssociationServiceAsync.associateByExternalAccount].
         */
        fun associateByExternalAccount(
            listId: String,
            params: ListAssociationAssociateByExternalAccountParams,
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(listId, params, RequestOptions.none())

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            listId: String,
            params: ListAssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            params: ListAssociationAssociateByExternalAccountParams
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(params, RequestOptions.none())

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            params: ListAssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [ListAssociationServiceAsync.deleteByExternalAccount].
         */
        fun deleteByExternalAccount(
            listId: String,
            params: ListAssociationDeleteByExternalAccountParams,
        ): CompletableFuture<HttpResponse> =
            deleteByExternalAccount(listId, params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            listId: String,
            params: ListAssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            params: ListAssociationDeleteByExternalAccountParams
        ): CompletableFuture<HttpResponse> = deleteByExternalAccount(params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            params: ListAssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists`,
         * but is otherwise the same as [ListAssociationServiceAsync.listByExternalAccount].
         */
        fun listByExternalAccount(
            externalEventId: String,
            params: ListAssociationListByExternalAccountParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            listByExternalAccount(externalEventId, params, RequestOptions.none())

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            externalEventId: String,
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            listByExternalAccount(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> =
            listByExternalAccount(params, RequestOptions.none())

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>>
    }
}
