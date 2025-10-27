// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalPublicListNoPaging
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync

    /** Gets lists associated with a marketing event by marketing event id */
    fun list(
        marketingEventId: String
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        list(marketingEventId, AssociationListParams.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        params: AssociationListParams = AssociationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see list */
    fun list(
        marketingEventId: String,
        params: AssociationListParams = AssociationListParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        list(marketingEventId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging>

    /** @see list */
    fun list(
        params: AssociationListParams
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        list(marketingEventId, AssociationListParams.none(), requestOptions)

    /** Disassociates a list from a marketing event by marketing event id and ILS list id */
    fun delete(listId: String, params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Associates a list with a marketing event by marketing event id and ILS list id */
    fun associate(listId: String, params: AssociationAssociateParams): CompletableFuture<Void?> =
        associate(listId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        listId: String,
        params: AssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        associate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associate */
    fun associate(params: AssociationAssociateParams): CompletableFuture<Void?> =
        associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: AssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Associates a list with a marketing event by external account id, external event id, and ILS
     * list id
     */
    fun associateByExternalAccount(
        listId: String,
        params: AssociationAssociateByExternalAccountParams,
    ): CompletableFuture<Void?> = associateByExternalAccount(listId, params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        listId: String,
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: AssociationAssociateByExternalAccountParams
    ): CompletableFuture<Void?> = associateByExternalAccount(params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Disassociates a list from a marketing event by external account id, external event id, and
     * ILS list id
     */
    fun deleteByExternalAccount(
        listId: String,
        params: AssociationDeleteByExternalAccountParams,
    ): CompletableFuture<Void?> = deleteByExternalAccount(listId, params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        listId: String,
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: AssociationDeleteByExternalAccountParams
    ): CompletableFuture<Void?> = deleteByExternalAccount(params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Gets lists associated with a marketing event by external account id and external event id */
    fun listByExternalAccount(
        externalEventId: String,
        params: AssociationListByExternalAccountParams,
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        listByExternalAccount(externalEventId, params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        externalEventId: String,
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        listByExternalAccount(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: AssociationListByExternalAccountParams
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        listByExternalAccount(params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging>

    /**
     * A view of [AssociationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AssociationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists`, but is otherwise
         * the same as [AssociationServiceAsync.list].
         */
        fun list(
            marketingEventId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            list(marketingEventId, AssociationListParams.none())

        /** @see list */
        fun list(
            marketingEventId: String,
            params: AssociationListParams = AssociationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see list */
        fun list(
            marketingEventId: String,
            params: AssociationListParams = AssociationListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            list(marketingEventId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>>

        /** @see list */
        fun list(
            params: AssociationListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            marketingEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            list(marketingEventId, AssociationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}`, but is
         * otherwise the same as [AssociationServiceAsync.delete].
         */
        fun delete(
            listId: String,
            params: AssociationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(listId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            listId: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssociationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}`, but is
         * otherwise the same as [AssociationServiceAsync.associate].
         */
        fun associate(
            listId: String,
            params: AssociationAssociateParams,
        ): CompletableFuture<HttpResponse> = associate(listId, params, RequestOptions.none())

        /** @see associate */
        fun associate(
            listId: String,
            params: AssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            associate(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associate */
        fun associate(params: AssociationAssociateParams): CompletableFuture<HttpResponse> =
            associate(params, RequestOptions.none())

        /** @see associate */
        fun associate(
            params: AssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [AssociationServiceAsync.associateByExternalAccount].
         */
        fun associateByExternalAccount(
            listId: String,
            params: AssociationAssociateByExternalAccountParams,
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(listId, params, RequestOptions.none())

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            listId: String,
            params: AssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            params: AssociationAssociateByExternalAccountParams
        ): CompletableFuture<HttpResponse> =
            associateByExternalAccount(params, RequestOptions.none())

        /** @see associateByExternalAccount */
        fun associateByExternalAccount(
            params: AssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [AssociationServiceAsync.deleteByExternalAccount].
         */
        fun deleteByExternalAccount(
            listId: String,
            params: AssociationDeleteByExternalAccountParams,
        ): CompletableFuture<HttpResponse> =
            deleteByExternalAccount(listId, params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            listId: String,
            params: AssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams
        ): CompletableFuture<HttpResponse> = deleteByExternalAccount(params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists`,
         * but is otherwise the same as [AssociationServiceAsync.listByExternalAccount].
         */
        fun listByExternalAccount(
            externalEventId: String,
            params: AssociationListByExternalAccountParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            listByExternalAccount(externalEventId, params, RequestOptions.none())

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            externalEventId: String,
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            listByExternalAccount(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            params: AssociationListByExternalAccountParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> =
            listByExternalAccount(params, RequestOptions.none())

        /** @see listByExternalAccount */
        fun listByExternalAccount(
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>>
    }
}
