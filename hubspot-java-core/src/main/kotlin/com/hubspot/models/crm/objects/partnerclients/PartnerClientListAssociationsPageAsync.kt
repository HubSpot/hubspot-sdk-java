// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.partnerclients

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot.services.async.crm.objects.PartnerClientServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PartnerClientServiceAsync.listAssociations */
class PartnerClientListAssociationsPageAsync
private constructor(
    private val service: PartnerClientServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PartnerClientListAssociationsParams,
    private val response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging,
) : PageAsync<MultiAssociatedObjectWithLabel> {

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.results
     */
    fun results(): List<MultiAssociatedObjectWithLabel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MultiAssociatedObjectWithLabel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PartnerClientListAssociationsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PartnerClientListAssociationsPageAsync> =
        service.listAssociations(nextPageParams())

    fun autoPager(): AutoPagerAsync<MultiAssociatedObjectWithLabel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PartnerClientListAssociationsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PartnerClientListAssociationsPageAsync].
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

    /** A builder for [PartnerClientListAssociationsPageAsync]. */
    class Builder internal constructor() {

        private var service: PartnerClientServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PartnerClientListAssociationsParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            partnerClientListAssociationsPageAsync: PartnerClientListAssociationsPageAsync
        ) = apply {
            service = partnerClientListAssociationsPageAsync.service
            streamHandlerExecutor = partnerClientListAssociationsPageAsync.streamHandlerExecutor
            params = partnerClientListAssociationsPageAsync.params
            response = partnerClientListAssociationsPageAsync.response
        }

        fun service(service: PartnerClientServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerClientListAssociationsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [PartnerClientListAssociationsPageAsync].
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
        fun build(): PartnerClientListAssociationsPageAsync =
            PartnerClientListAssociationsPageAsync(
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

        return other is PartnerClientListAssociationsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PartnerClientListAssociationsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
