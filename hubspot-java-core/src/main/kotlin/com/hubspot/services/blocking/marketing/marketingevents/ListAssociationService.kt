// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.marketingevents

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalPublicList
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationAssociateParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationDeleteParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationListByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationListParams
import java.util.function.Consumer

interface ListAssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListAssociationService

    /** Gets lists associated with a marketing event by marketing event id */
    fun list(marketingEventId: String): CollectionResponseWithTotalPublicList =
        list(marketingEventId, ListAssociationListParams.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        params: ListAssociationListParams = ListAssociationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicList =
        list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see list */
    fun list(
        marketingEventId: String,
        params: ListAssociationListParams = ListAssociationListParams.none(),
    ): CollectionResponseWithTotalPublicList = list(marketingEventId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ListAssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicList

    /** @see list */
    fun list(params: ListAssociationListParams): CollectionResponseWithTotalPublicList =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicList =
        list(marketingEventId, ListAssociationListParams.none(), requestOptions)

    /** Disassociates a list from a marketing event by marketing event id and ILS list id */
    fun delete(listId: String, params: ListAssociationDeleteParams) =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListAssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ListAssociationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListAssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Associates a list with a marketing event by marketing event id and ILS list id */
    fun associate(listId: String, params: ListAssociationAssociateParams) =
        associate(listId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        listId: String,
        params: ListAssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = associate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associate */
    fun associate(params: ListAssociationAssociateParams) = associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: ListAssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Associates a list with a marketing event by external account id, external event id, and ILS
     * list id
     */
    fun associateByExternalAccount(
        listId: String,
        params: ListAssociationAssociateByExternalAccountParams,
    ) = associateByExternalAccount(listId, params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        listId: String,
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(params: ListAssociationAssociateByExternalAccountParams) =
        associateByExternalAccount(params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Disassociates a list from a marketing event by external account id, external event id, and
     * ILS list id
     */
    fun deleteByExternalAccount(
        listId: String,
        params: ListAssociationDeleteByExternalAccountParams,
    ) = deleteByExternalAccount(listId, params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        listId: String,
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(params: ListAssociationDeleteByExternalAccountParams) =
        deleteByExternalAccount(params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Gets lists associated with a marketing event by external account id and external event id */
    fun listByExternalAccount(
        externalEventId: String,
        params: ListAssociationListByExternalAccountParams,
    ): CollectionResponseWithTotalPublicList =
        listByExternalAccount(externalEventId, params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        externalEventId: String,
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicList =
        listByExternalAccount(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams
    ): CollectionResponseWithTotalPublicList = listByExternalAccount(params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicList

    /**
     * A view of [ListAssociationService] that provides access to raw HTTP responses for each
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
        ): ListAssociationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists`, but is
         * otherwise the same as [ListAssociationService.list].
         */
        @MustBeClosed
        fun list(marketingEventId: String): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            list(marketingEventId, ListAssociationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            params: ListAssociationListParams = ListAssociationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            params: ListAssociationListParams = ListAssociationListParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            list(marketingEventId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListAssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicList>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListAssociationListParams
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            list(marketingEventId, ListAssociationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}`, but
         * is otherwise the same as [ListAssociationService.delete].
         */
        @MustBeClosed
        fun delete(listId: String, params: ListAssociationDeleteParams): HttpResponse =
            delete(listId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: ListAssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ListAssociationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ListAssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}`, but
         * is otherwise the same as [ListAssociationService.associate].
         */
        @MustBeClosed
        fun associate(listId: String, params: ListAssociationAssociateParams): HttpResponse =
            associate(listId, params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            listId: String,
            params: ListAssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = associate(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associate */
        @MustBeClosed
        fun associate(params: ListAssociationAssociateParams): HttpResponse =
            associate(params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            params: ListAssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [ListAssociationService.associateByExternalAccount].
         */
        @MustBeClosed
        fun associateByExternalAccount(
            listId: String,
            params: ListAssociationAssociateByExternalAccountParams,
        ): HttpResponse = associateByExternalAccount(listId, params, RequestOptions.none())

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            listId: String,
            params: ListAssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            params: ListAssociationAssociateByExternalAccountParams
        ): HttpResponse = associateByExternalAccount(params, RequestOptions.none())

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            params: ListAssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [ListAssociationService.deleteByExternalAccount].
         */
        @MustBeClosed
        fun deleteByExternalAccount(
            listId: String,
            params: ListAssociationDeleteByExternalAccountParams,
        ): HttpResponse = deleteByExternalAccount(listId, params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            listId: String,
            params: ListAssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            params: ListAssociationDeleteByExternalAccountParams
        ): HttpResponse = deleteByExternalAccount(params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            params: ListAssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists`,
         * but is otherwise the same as [ListAssociationService.listByExternalAccount].
         */
        @MustBeClosed
        fun listByExternalAccount(
            externalEventId: String,
            params: ListAssociationListByExternalAccountParams,
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            listByExternalAccount(externalEventId, params, RequestOptions.none())

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            externalEventId: String,
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            listByExternalAccount(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> =
            listByExternalAccount(params, RequestOptions.none())

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicList>
    }
}
