// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.partnerclients

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.services.async.crm.objects.PartnerClientServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PartnerClientServiceAsync.list */
class PartnerClientListPageAsync
private constructor(
    private val service: PartnerClientServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PartnerClientListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging,
) : PageAsync<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SimplePublicObjectWithAssociations> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PartnerClientListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PartnerClientListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplePublicObjectWithAssociations> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PartnerClientListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociationsForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PartnerClientListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerClientListPageAsync]. */
    class Builder internal constructor() {

        private var service: PartnerClientServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PartnerClientListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(partnerClientListPageAsync: PartnerClientListPageAsync) = apply {
            service = partnerClientListPageAsync.service
            streamHandlerExecutor = partnerClientListPageAsync.streamHandlerExecutor
            params = partnerClientListPageAsync.params
            response = partnerClientListPageAsync.response
        }

        fun service(service: PartnerClientServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerClientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [PartnerClientListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PartnerClientListPageAsync =
            PartnerClientListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerClientListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PartnerClientListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
